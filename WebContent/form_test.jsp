<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원가입</h1>
	<form action="/WebEx02/param" method="post">

		<table cellpadding="10px" cellspacing="0" border="1px">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><input type="radio" name="gender" value="남자">남자<input
					type="radio" name="gender" value="여자">여자</td>
			</tr>
			<tr>
				<td>좋아하는 악세사리</td>
				<td><input type="checkbox" name="interest" value="신발">신발
					<input type="checkbox" name="interest" value="가방">가방 <input
					type="checkbox" name="interest" value="벨트">벨트 <input
					type="checkbox" name="interest" value="모자">모자 <input
					type="checkbox" name="interest" value="시계">시계</td>
			</tr>
			<tr>
				<td>직업</td>
				<td><select name="job">
						<option value="">선택하세요</option>
						<option value="학생">학생</option>
						<option value="IT종사자">IT 종사자</option>
						<option value="교육">교육</option>
						<option value="언론">언론</option>
						<option value="서비스">서비스</option>
						<option value="기타">기타</option>
				</select>
			</tr>
			<tr>
				<td>가입인사</td>
				<td><textarea name="textarea" rows="3" cols="35"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="가입완료" /></td>
			</tr>
		</table>

	</form>


</body>
</html>