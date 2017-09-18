$f("df",__,function(_url){
    var server="backend/";
    if(this.ISTEST){
        return server+_url;
    }else{
        return "/proxy/"+server+_url;
    }
});
