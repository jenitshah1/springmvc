$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/springmvc/rest/emp/1"
    }).then(function(data) {
       $('.emp-id').append(data.id);
       $('.emp-name').append(data.name);
    });
});