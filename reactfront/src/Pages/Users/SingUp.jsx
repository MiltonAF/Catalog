import axios from 'axios'
import React,{ useState } from 'react'
import { useNavigate } from 'react-router-dom'
import md5 from 'md5'

const URI = 'http://localhost:8080/catalogs/company'

const SingUp = () => {
    const [name, setName] = useState('')
    const [username, setUsername] = useState('')
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const [phone, setPhone] = useState('')
    const [address, setAddress] = useState('')
    const navigate = useNavigate()

    // //procedimiento guardar
    const store = async (e) => {
       e.preventDefault()
        await axios.post(URI, { name: name, username: username, email: email, password: md5(password), phone: phone, address: address })
        navigate('/')
    }

    return (
        <div>
            <form onSubmit={store}>
                <div className='form-head'>
                    <h2>Registrer</h2>
                </div>

                <div className="form-body">
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input
                            type='text'
                            placeholder='Nombre de la empresa'
                            value={name}
                            onChange={(e) => setName(e.target.value)}
                          
                        ></input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input type='text'
                            placeholder='Email'
                            
                           
                        ></input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input type='number'
                            placeholder='Telefono'
                           
                        ></input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input type='text'
                            placeholder='Dirrecion'>
                           
                        </input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-user"></i>
                        <input type='text'
                            placeholder='Usuario'>
                          
                        </input>
                    </div>
                    <div className='text-field'>
                        <i class="fa-solid fa-key"></i>
                        <input type='password'
                            placeholder='Contraseña'>
                            
                        </input>
                    </div>

                </div>
                <div className='form-footer'>
                    <button type='submit' className='btn'>Guardar</button>
                    <a href="/singup" className='btn'>Iniciar Session</a>

                </div>

            </form>

        </div>

    )
}

export default SingUp;