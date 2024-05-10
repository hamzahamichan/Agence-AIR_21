<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire de ticket de vol</title>
    <style>
        /* Styles CSS pour le formulaire */
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            padding: 20px;
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        button[type="submit"] {
            background-color: #007bff;
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }
        button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Formulaire de ticket de vol</h1>
    <form action="<%=request.getContextPath()%>/forml.java" method="post">
        <label for="vol">Numéro de vol :</label>
        <input type="number" name="vol" id="vol" required>
        <label for="ville_depart">Ville de départ :</label>
        <input type="text" name="ville_depart" id="ville_depart">
        <label for="Date_depart">Date de départ :</label>
        <input type="date" name="Date_depart" id="Date_depart">
        <label for="distination">Destination :</label>
        <input type="text" name="distination" id="distination" >
        <label for="nombre_passager">Nombre de passagers :</label>
        <input type="number" name="nombre_passager" id="nombre_passager">
        <label for="prix">Prix :</label>
        <input type="text" name="prix" id="prix">
        <button type="submit">Valider</button>
    </form>
</body>
</html>
