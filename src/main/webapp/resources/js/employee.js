$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/springmvc/rest/emp/1"
    }).then(function(data) {
       $('#emp-id').append("The Employee ID :"+data.id);
       $('#emp-name').append("The Employee Name :"data.name);
    });
});