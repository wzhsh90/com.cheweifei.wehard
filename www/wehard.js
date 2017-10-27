var exec = require('cordova/exec');

function weHardClassFun() {

}
weHardClassFun.prototype={
  receiveData: function(success,error,data,sessionkey,aeskey) {
        cordova.exec(success, error, "WeHardPlugin", "receiveData", [data,sessionkey,aeskey]);
    },
  sendData:function(success, error,data,sessionkey){
        cordova.exec(success, error, "WeHardPlugin", "sendData", [data,sessionkey]);
    }
};
var wehard_ = new weHardClassFun();
module.exports = wehard_;

