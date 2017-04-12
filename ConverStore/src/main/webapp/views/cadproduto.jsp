<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/assets/css/cadproduto.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="cad-form">
		<div  class="form-group">
			<label id="cdproduto" class="col-md-4 control-label">0000</label><br/>
		</div>
	
		<div  class="form-group">
			<label class="col-md-4 control-label">Produto: </label><input type="text" style="width: 500px;" class="col-md-4 inputGroupContainer"><br />
		</div>
		<div  class="form-group">
			<label class="col-md-4 control-label">Altura: </label><input type="text" style="width: 100px;" class="col-md-4 inputGroupContainer">
			<label class="col-md-4 control-label">Largura: </label><input type="text" style="width: 100px;" class="col-md-4 inputGroupContainer"><br />
		</div>
		<div class="navbar-collapse ">
			<label>Embalagens</label>
			<div>
				<label>Fabricante: </label><input type="text" style="width: 100px;"><br />
			</div>
			<div>
				<label>Alternativa Fabricante: </label><input type="text"
					style="width: 100px;"><br />
			</div>
			<div>
				<label>Vendas: </label><input type="text" style="width: 100px;"><br />
			</div>
		</div>
	</div>
	<div class="navbar-brand">
		<button class="btn-default navbar-btn">Salvar</button>
		<button class="btn-default navbar-btn">Editar</button>
		<button class="btn-default navbar-btn">Excluir</button>
		<button class="btn-default navbar-btn">Buscar</button>
	</div>
</body>
</html>