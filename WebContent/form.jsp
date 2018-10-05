<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INPUT 1</title>
</head>
<body>
<h1>INPUT 1</h1>

<form method="GET" action="paragrafx">

<textarea rows="2" cols="50" name="masukan"  maxlength="100" placeholder="INPUT">${test1}</textarea>
<br>
<br>
<textarea rows="2" cols="50" name="keluaran"  maxlength="100" placeholder="OUTPUT">${test2}</textarea>
<br><br>


<input type="submit" value="filter">

</form>

<form method="GET" action="saveparagraf">


 
<textarea style="display:none; rows="2" cols="50" name="masukan1"  maxlength="100" placeholder="INPUT">${test1}</textarea>
<textarea style="display:none; rows="2" cols="50" name="keluaran1"  maxlength="100" placeholder="OUTPUT">${test2}</textarea>
<textarea style="display:none;  rows="2" cols="50" name="parameter"  maxlength="100" placeholder="parameter">${test3}</textarea>

<input type="submit" value="simpan">
</form>

</body>
</html>