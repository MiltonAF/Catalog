import React from 'react';
import CardCatalog from '../../Components/CardCatalog';
import Header from '../../Components/Header';
import Logo from '../../Img/logo-design.png'


const AllCatalogs = () => {
    return (
        <div>
            <Header text='Catalogos' />
            <section className='body'>
            <CardCatalog
                img={Logo}
                tit="POINT"
                txt="ACEPTA TARJETAS"
                date="12/12/12"
                btn="Ver más" />
            <CardCatalog
                img={Logo}
                tit="POINT"
                txt="ACEPTA TARJETAS"
                date="12/12/12"
                btn="Ver más" />
            <CardCatalog
                img={Logo}
                tit="POINT"
                txt="ACEPTA TARJETAS"
                date="12/12/12"
                btn="Ver más" />
            <CardCatalog
                img={Logo}
                tit="POINT"
                txt="ACEPTA TARJETAS"
                date="12/12/12"
                btn="Ver más" />
            <CardCatalog
                img={Logo}
                tit="POINT"
                txt="ACEPTA TARJETAS"
                date="12/12/12"
                btn="Ver más" />
            </section>
        </div>
    );
};

export default AllCatalogs;