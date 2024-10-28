const base = {
    get() {
                return {
            url : "http://localhost:8080/shangpinxiaoshou/",
            name: "shangpinxiaoshou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shangpinxiaoshou/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "商品营销系统"
        } 
    }
}
export default base
