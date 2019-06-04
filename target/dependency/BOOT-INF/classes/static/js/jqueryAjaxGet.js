$(document).ready(function() {

		
		$.ajax({
			type : "GET",
			url : "http://localhost:8080/im-day",
			success: function(result){
				//console.log(result);
				$.each(result, function(index, customer){
					console.log(index);
					console.log(customer);
					var customerRow = '<tr>' +
					
										'<td>' + customer.name + '</td>' +
									
										'<td>' + customer.solved_day + '</td>' +
										
								        '<td class="text-center">' +
								        	'<input type="hidden" value=' + customer.id + '>' +
								        	'<a>' +
						          				
						        			'</a>' +
								        '</td>' +
									  '</tr>';
					
					$('#customerTable tbody').append(customerRow);
					
		        });
				
				$( "#customerTable tbody tr:odd" ).addClass("info");
				$( "#customerTable tbody tr:even" ).addClass("success");
			},
			error : function(e) {
				alert("ERROR: ", e);
				console.log("ERROR: ", e);
			}
		});	

	
	
})