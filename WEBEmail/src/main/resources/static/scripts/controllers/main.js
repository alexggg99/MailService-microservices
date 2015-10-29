/**
 * Created by alexggg99 on 15.10.15.
 */

angular.module('app')
    .controller('MainCtrl', function($scope, $http){
        $scope.test = function(){
            $http({
                method: 'GET',
                url: 'http://localhost:8080/races'
            }).then(function(response) {
                $scope.races = response.data;
            }, function(response) {
                console.error('Error requesting races');
            });
        }
    });