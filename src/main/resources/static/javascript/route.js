/**
 * Created by zhongxia on 6/9/17.
 */

app.config(['$routeProvider', function($routeProvider){
    $routeProvider
        .when('/',{template:'这是首页页面'})
        .otherwise({redirectTo:'/'});
}]);