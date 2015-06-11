<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Aplikasi ToDo</title>
  
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
  
  <!-- Theme Aplikasi -->
  <link rel="stylesheet" href="${request.contextPath}/css/todo.css">
  
</head>
<body>

    <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" class="active"><a href="${request.contextPath}">Home</a></li>
            <li role="presentation"><a href="#">About</a></li>
            <li role="presentation"><a href="#">Contact</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Aplikasi ToDo</h3>
      </div>

      <div class="jumbotron">
        <h1>Daftar Todo</h1>
        
        <table>
            <thead>
                <tr>
                    <th>&nbsp;</th>
                    <th>Pekerjaan</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="t" items="${todo}">
                <tr>
                    <td>${t.selesai}</td>
                    <td>${t.keterangan}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        
      </div>
    
      
      <footer class="footer">
        <p>&copy; <a href="http://software.endy.muhardin.com">Endy Muhardin</a> 2015</p>
      </footer>

    </div> <!-- /container -->


    
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>
