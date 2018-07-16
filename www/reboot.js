var exec = require('cordova/exec');

exports.reboot = function (success, error) {
    cordova.exec(success, error, 'CordovaRebootPlugin', 'reboot', []);
};
