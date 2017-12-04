(function () {
    'use strict';

    angular
        .module('jhMicroservicesGatewayApplicationApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
