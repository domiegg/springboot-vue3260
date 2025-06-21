const base = {
    get() {
        return {
            url : "http://localhost:8080/zuqiujulebguanli/",
            name: "zuqiujulebguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zuqiujulebguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "足球俱乐部管理系统"
        } 
    }
}
export default base
