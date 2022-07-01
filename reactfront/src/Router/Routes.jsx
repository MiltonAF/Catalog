import React from 'react'
import '../Style/FooterBar.css'
import '../Style/Card.css'
import '../Style/Header.css'
import '../Style/Form.css'

import AllCatalogs from '../Pages/Catalags/AllCatalogs.jsx'
import FooterBar from '../Components/FooterBar.jsx'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import AllCompanys from '../Pages/Companys/AllCompanys'
import SingIn from '../Pages/Users/SingIn'
import SingUp from '../Pages/Users/SingUp'


const App = () => {
  return (
    <BrowserRouter>
      <FooterBar>
        <Routes>
        <Route path="/" element={<AllCatalogs />} />
        <Route path="/company" element={<AllCompanys />} />
        <Route path="/login" element={<SingIn />} />
        <Route path="/singup" element={<SingUp />} />
         
        </Routes>
      </FooterBar>
    </BrowserRouter>
  );
}

export default App;
