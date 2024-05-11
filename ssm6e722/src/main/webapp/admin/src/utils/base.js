const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm6e722/",
            name: "ssm6e722",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6e722/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生闲置物品交易平台小程序"
        } 
    }
}
export default base
