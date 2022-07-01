import React from 'react';
import { NavLink } from 'react-router-dom';


const FooterBar = ({children}) => {
    const menuItem=[
        {
            path:"/",
            name:"Catalogos",
            icon:<i class="fa-solid fa-book-open"></i>
        },
        {
            path:"/company",
            name:"Compañias",
            icon:<i class="fa-solid fa-building"></i>
        },
        {
            path:"/login",
            name:"Cuenta",
            icon:<i class="fa-solid fa-user"></i>
        }
    ]
    return (
        <div>
           <div className="nav">
               
               {
                   menuItem.map((item, index)=>(
                       <NavLink to={item.path} key={index} className="nav__link" activeclassName="active">
                           <div className="icon">{item.icon}</div>
                           <div className="nav__text">{item.name}</div>
                       </NavLink>
                   ))
               }
           </div>
           <main>{children}</main>
        </div>
    );
};

export default FooterBar;