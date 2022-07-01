import React from "react";

const CardCatalog = (props) => {
    return (
        <div className="card-catalog">
            <div className="card-body">
                <div className="card-logo">
                    <img src={props.img} width='80' />
                </div>
                <div className="card-content">
                    <h1>{props.tit}</h1>
                    <p>{props.txt}</p>
                    <p>{props.date}</p>
                </div>
            </div>

            <div className="card-bottom">
                <a href=""> {props.btn} </a>
            </div>
        </div>
    )
}

export default CardCatalog