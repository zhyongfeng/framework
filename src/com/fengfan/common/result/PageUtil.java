package com.fengfan.common.result;

import java.util.List;

import org.hibernate.Criteria;


public class PageUtil {
      
    /**
     * @param page
     * @param totalRecords
     * @return
     */
    public static Page createPage(Page page, long totalRecords){
        return createPage(page.getPageSize(), page.getCurrentPage(), totalRecords);
    }
    
    /**
     * @param pageSize - record number of each page.
     * @param currentPage -  current page number
     * @param totalRecords - total record count
     * @return
     */
    public static Page createPage(int pageSize, int currentPage, long totalRecords){
        pageSize = getPageSize(pageSize);
        currentPage = getCurrentPage(currentPage);
        int beginIndex = getBeginIndex(pageSize, currentPage);
        int totalPage = getTotalPage(pageSize, totalRecords);
        boolean hasNextPage = hasNextPage(currentPage, totalPage);
        boolean hasPrePage = hasPrePage(currentPage);
       
        return new Page(hasPrePage, hasNextPage, 
                                pageSize, totalPage, totalRecords,
                                currentPage, beginIndex);
    }
    
    public static <EntityType> Result<EntityType> paginateSearchResult(int pageSize, int currentPage,
			Criteria criteria) {
    	try{
			int count = criteria.list().size();
			
			if ((pageSize > 0) && (currentPage > 0)) {
		        criteria.setFirstResult(pageSize * (currentPage - 1));
		        criteria.setMaxResults(pageSize);
		    }
			
			List<EntityType> list = criteria.list();
		    Page page = PageUtil.createPage(pageSize, currentPage, count);        
		    Result<EntityType> result = new Result<EntityType>(page, list);
		    return result;
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return null;
    	}
	}
   
    private static int getPageSize(int pageSize){
        return pageSize == 0 ? 5 : pageSize;
    }
   
    private static int getCurrentPage(int currentPage){
        return currentPage == 0 ? 1 : currentPage;
    }
   
    private static int getBeginIndex(int pageSize, int currentPage){
        return (currentPage - 1) * pageSize;
    }
       
    private static int getTotalPage(int pageSize, long totalRecords){
        int totalPage = 0;
               
        if(totalRecords % pageSize == 0)
            totalPage = (int)totalRecords / pageSize;
        else
            totalPage = (int)totalRecords / pageSize + 1 ;
        
        return totalPage;
    }
   
    private static boolean hasPrePage(int currentPage){
        return currentPage == 1 ? false : true;
    }
   
    private static boolean hasNextPage(int currentPage, int totalPage){
        return currentPage == totalPage || totalPage == 0 ? false : true;
    }
   

} 