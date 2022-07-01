import React from 'react';
import axios from 'axios';
import Cookies from 'universal-cookie';
import { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'


const baseUrl = "http://localhost:8080/catalogs/company";
const cookies = new Cookies();


const SingIn = () => {

    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')
    const navigate = useNavigate()


    const iniciarSesion = async () => {
        await axios.get(baseUrl, { params: { username: setUsername, password: setPassword } })
            .then(response => {
                return response.data;
            })
            .then(response => {
                if (response.length > 0) {
                    var respuesta = response[0];
                    cookies.set('id', respuesta.id, navigate('/'));
                    cookies.set('name', respuesta.name, navigate('/'));
                    cookies.set('username', respuesta.username, navigate('/'));
                    cookies.set('email', respuesta.email, navigate('/'));
                    cookies.set('phone', respuesta.phone, navigate('/'));
                    cookies.set('address', respuesta.address, navigate('/'));
                    alert(`Bienvenido ${respuesta.name}`);
                   
                } else {
                    alert('El usuario o la contraseña no son correctos');
                    
                }
            })
            .catch(error => {
                console.log(error);
            })

    }

 

    return (
        <div>
            <form onSubmit={iniciarSesion}>
                <div className='form-head'>
                    <h2>Iniciar Session</h2>
                </div>

                <div className="form-body">
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input type="text"

                            name="username"
                            value={username}
                            onChange={(e) => setUsername(e.target.value)}
                            placeholder='Nombre de usuario'></input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-key"></i>
                        <input type="password"
                            value={password}
                            name="password"
                            onChange={(e) => setPassword(e.target.value)}
                            placeholder='Contraseña'></input>
                    </div>

                </div>
                <div className='form-footer'>

                    <button type='submit' className='btn'>Entrar</button>
                    <Link to={'/singup'} className='btn'>Registrate</Link>
                   

                </div>

            </form>

        </div>
    );
};

export default SingIn;