/**
 * Created by zhongxia on 6/9/17.
 */



app.filter('bookmarkFilter', function () {
    return function (x) {
        return x.toUpperCase();
    }
});