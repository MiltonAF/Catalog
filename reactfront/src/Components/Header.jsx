import React from "react";

const Header = (props) => {
    return (<div>
        <div className="cont-head">
            <div className="header">
                <h2>{props.text}</h2>
            </div>
        </div>
    </div>);
}

export default Header;