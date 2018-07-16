var exec = require('cordova/exec');

exports.reboot = function (success, error) {
    exec(success, error, 'cordova-plugin-reboot', 'reboot', []);
};
