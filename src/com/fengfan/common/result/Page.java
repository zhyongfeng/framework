package com.fengfan.common.result;
public class Page {

    private boolean hasPrePage;

    private boolean hasNextPage;
       
    private int pageSize;
    
	private int totalPage;
    
    private long totalRecords;
       
    private int currentPage;
   
    private int beginIndex;
    
    public static String CURRENT_PAGE="currentPage";
    
    public static String PAGE_SIZE="pageSize";
   
    /** The default constructor */
    public Page(){
       
    }
   
    /** construct the page by pageSize
     * @param pageSize
     * */
    public Page(int pageSize){
        this.pageSize = pageSize;
    }
   
    /** The whole constructor */
    public Page(boolean hasPrePage, boolean hasNextPage, 
                    int pageSize, int totalPage, long totalRecords,
                    int currentPage, int beginIndex) {
        this.hasPrePage = hasPrePage;
        this.hasNextPage = hasNextPage;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalRecords = totalRecords;
        this.currentPage = currentPage;
        this.beginIndex = beginIndex;
    }

    /**
     * @return
     * Returns the beginIndex.
     */
    public int getBeginIndex() {
        return beginIndex;
    }
   
    /**
     * @param beginIndex
     * The beginIndex to set.
     */
    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }
   
    /**
     * @return
     * Returns the currentPage.
     */
    public int getCurrentPage() {
        return currentPage;
    }
   
    /**
     * @param currentPage
     * The currentPage to set.
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
   
    /**
     * @return
     * Returns the hasNextPage.
     */
    public boolean getHasNextPage() {
        return hasNextPage;
    }
   
    /**
     * @param hasNextPage
     * The hasNextPage to set.
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
   
    /**
     * @return
     * Returns the hasPrePage.
     */
    public boolean getHasPrePage() {
        return hasPrePage;
    }
   
    /**
     * @param hasPrePage
     * The hasPrePage to set.
     */
    public void setHasPrePage(boolean hasPrePage) {
        this.hasPrePage = hasPrePage;
    }
   

    /**
     * @return
     */
    public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
    /**
     * @return Returns the totalPage.
     *
     */
    public int getTotalPage() {
        return totalPage;
    }
   
    /**
     * @param totalPage
     * The totalPage to set.
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    
    /**
     * @param totalRecords
     * The totalRecords to set.
     */
    public void setTotalRecords(long totalRecords)
    {
        this.totalRecords = totalRecords;
    }
    /**
     * @return Returns the totalRecords.
     *
     */
    public long getTotalRecords()
    {
        return this.totalRecords;
    }
    
}
