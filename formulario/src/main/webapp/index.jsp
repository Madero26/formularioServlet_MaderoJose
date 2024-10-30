<%-- 
    Document   : index
    Created on : 30 oct 2024, 9:02:40 a.m.
    Author     : jl4ma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
        <link rel="stylesheet" href="style/formulario.css"/>
    </head>
    <body>
        <form action="RegistroInformacion" method="POST">
            <section>
                <header>
                    <h1>Create Account</h1>
                </header>
                <div class="nombres">
                    <div>
                        <label for="FirstName">Firts name*</label>
                        <div>
                            <input type="text" name="name" placeholder="enter your first name">
                        </div>
                    </div>
                   <div>
                       <label for="LastName">Last name</label>
                        <div>
                           <input type="text" name="lastName" placeholder="enter your last name"> 
                        </div>
                    </div>    
                </div>
                <div class="email">
                    <div>
                        <label for="email">Email*</label>
                        <div>
                         <input type="email" name="email" placeholder="enter your email">   
                        </div>
                    </div>
                </div>
                <div class="contra">
                    <div>
                        <label for="password">Password*</label>
                        <div>
                         <input type="password" name="password" placeholder="enter your password">   
                        </div>
                    </div>
                    <div>
                        <label for="confirmPassword">Confirm Password*</label>
                        <div>
                           <input type="password" name="confirmPassword" placeholder="enter your password again"> 
                        </div>
                    </div>
                </div>
                <div class="actividades">
                    <div>
                     <label for="gender">Gender:</label>
                     <div>
                    <input type="radio" name="gender" value="male">
                    <label for="male">Male</label>
                    <input type="radio" name="gender" value="female">
                    <label for="male">Female</label>  
                    </div>
                    </div>
                    <div>
                    <label for="hobbies">Hobbies</label>
                    <div>
                    <input type="checkbox" id="hobbie" name="music" value="music">
                    <label for="male">Music</label>
                    <input type="checkbox" id="hobbie" name="sport" value="sport">
                    <label for="male">Sports</label>
                    <input type="checkbox" id="hobbie" name="travel" value="travel">
                    <label for="male">Travel</label>
                    <input type="checkbox" id="hobbie" name="movie" value="movie">
                    <label for="male">Movies</label>
                    </div>
                </div>
                </div>
                <div class="sourceYincome">
                    <div>
                        <label for="source">Source of Income</label>
                        <div>
                          <select id="opciones" name="opciones">
                        <option value="1">Employed</option>
                        <option value="2">Student</option>
                        <option value="3">Desemployed</option>
                    </select>  
                        </div>
                    </div>
                    <div>
                        <label for="income">Income</label>
                        <div>
                         <input type="range" name="income" min="1" max="20000">
                    <input type="button" name="20k" value="20K">   
                        </div>
                    </div>
                </div>
                <div class="fileYAge">
                    <div>
                        <label for="picture">Upload Profile Picture</label>
                        <div>
                          <input type="file" name="picture" accept="image/*">  
                        </div>
                    </div>
                    <div>
                        <label for="age">Age</label>
                        <div>
                          <input type="number" name="edad">  
                        </div>
                    </div>
                </div>
                <div class="bio">
                    <div>
                        <label for="bio">Bio</label>
                        <div>
                          <textarea name="comentarios" rows="5" cols="80"></textarea>  
                        </div>
                    </div>
                </div>
                <footer>
                    <input type="submit" value="Create">
                </footer>

            </section>

        </form>
    </body>
</html>
