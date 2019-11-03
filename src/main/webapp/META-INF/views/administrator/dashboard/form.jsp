<h2>
	<acme:message code="administrator.dashboard.form.title.charts"/>
</h2>

<div>
	<canvas id="canvas"></canvas>
</div>

<script type="text/javascript">
	$(document).ready(function)(){
		var data = {
			labels : [	
				"Sector1" , "Sector2", "Sector3"
			],
			datasets : [
				{
					data : [
						<jstl:out value="${}"
						
					]
					
				}
			]	
		}
		
	}


</script>