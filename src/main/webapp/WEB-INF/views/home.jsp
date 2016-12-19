<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Online Bus seat booking</title>
<!-- bootstrap -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/resource/bootstrap/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/resource/style/style.css" />">
<!-- jquery -->
<script
	src="<c:url value="/resources/resource/jquery/jquery-3.1.1.min.js" />"></script>
<script
	src="<c:url value="/resources/resource/bootstrap/js/bootstrap.min.js" />"></script>
<!-- date time picker -->
<script
	src="<c:url value="/resources/resource/datetimepicker/bootstrap-datetimepicker.min.js" />"></script>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/resource/datetimepicker/bootstrap-datetimepicker.min.css" />">

</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button aria-controls="navbar" aria-expanded="false"
					data-target="#navbar" data-toggle="collapse"
					class="navbar-toggle collapsed" type="button">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand">Bus Reservation Ticket Booking</a>
			</div>
			<div class="navbar-collapse collapse" id="navbar">
				<ul class="nav navbar-nav">


				</ul>
			</div>
		</div>
	</nav>
	<div class="container bus-container">
		<div class="row">
			<div class="col-md-offset-2 col-md-9">
				<div class="well well-sm">
					<h3>Bus Reservation Ticket Booking</h3>
				</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<form action="<c:url value='/buses' />" class="form-horizontal" role="form" method="get" commandName="searchBus">
							<fieldset>

								<div class="form-group">
									<label for="dtp_input1" class="col-md-3 control-label">From</label>
									<div class="input-group  col-md-6">

										<select name="source" class="form-control">
											<!-- multiple="multiple" to display multiple options-->
											<option>Lord Voldemort</option>
											<option>Albus Dumbledore</option>
											<option>Harry Potter</option>
											<option>Ron Weasley</option>
											<option>Severus Snape</option>
										</select>
									</div>

								</div>
								<div class="form-group">
									<label for="dtp_input1" class="col-md-3 control-label">To</label>
									<div class="input-group  col-md-6">

										<select name="destination" class="form-control">
											<!-- multiple="multiple" to display multiple options-->
											<option>Lord Voldemort</option>
											<option>Albus Dumbledore</option>
											<option>Harry Potter</option>
											<option>Ron Weasley</option>
											<option>Severus Snape</option>
										</select>
									</div>

								</div>

								<div class="form-group">
									<label for="dtp_input2" class="col-md-3 control-label">Date
									</label>
									<div class="input-group date form_date col-md-6" data-date=""
										data-date-format="dd MM yyyy" data-link-field="dtp_input2"
										data-link-format="yyyy-mm-dd">
										<input name="date" class="form-control" size="16" type="text" value=""
											readonly> <span class="input-group-addon"><span
											class="glyphicon glyphicon-calendar"></span></span>
									</div>
									<input type="hidden" id="dtp_input2" value="" /><br />
								</div>
								<div class="form-group">
									<label for="dtp_input3" class="col-md-3 control-label">From
										Time </label>
									<div class="input-group date form_time col-md-2" data-date=""
										data-date-format="hh:ii" data-link-field="dtp_input3"
										data-link-format="hh:ii">
										<input name="fromTime" class="form-control" size="16" type="text" value=""
											readonly> <span class="input-group-addon"><span
											class="glyphicon glyphicon-time"></span></span>
									</div>
									<label for="dtp_input3" class="col-md-2 control-label">From
										To </label>
									<div class="input-group date form_time col-md-2" data-date=""
										data-date-format="hh:ii" data-link-field="dtp_input3"
										data-link-format="hh:ii">
										<input class="form-control" size="16" type="text" value=""
											readonly> <span class="input-group-addon"><span
											class="glyphicon glyphicon-time"></span></span>
									</div>
									<input name="toTime" type="hidden" id="dtp_input3" value="" /><br />

								</div>
								<div class="col-sm-offset-2 col-sm-8">
									<button type="submit" class="btn btn-block btn-warning">Search</button>
								</div>
							</fieldset>
						</form>
					</div>
					<div></div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<footer>
		<div class="row">
			<div class="col-lg-12">
				<div class="container">
					<p>
						Copyright &copy; Bus Reservation System
					</p>
				</div>

			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</footer>
	<script
		src="<c:url value="/resources/resource/datetimepicker/bootstrap-datetimepicker.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/resource/jquery/jquery-3.1.1.min.js" />"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/resource/bootstrap/js/bootstrap.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/resource/datetimepicker/bootstrap-datetimepicker.js" />"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/resource/datetimepicker/locales/bootstrap-datetimepicker.uk.js" />"
		charset="UTF-8"></script>
<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        //language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
	$('.form_date').datetimepicker({
        language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	$('.form_time').datetimepicker({
        language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 1,
		minView: 0,
		maxView: 1,
		forceParse: 0
    });
</script>
</body>
</html>
