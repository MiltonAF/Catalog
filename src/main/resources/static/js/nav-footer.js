class nav extends HTMLElement{
    constructor(){
        super();
    }

    connectedCallback(){
        
        this.innerHTML = `
        <link rel="stylesheet" href="../static/css/nav.css">
        <div class="nav">
        <ul>
            <li class="list active">
                <a href="index.html"><span class="icon"><i class="fa-solid fa-house"></i></span>
                    </a>
            </li>
            <li class="list">
                <a href="search.html"><span class="icon"><i class="fa-solid fa-magnifying-glass"></i></span>
                </a>
            </li>
            <li class="list">
                <a href="login.html"><span class="icon"><i class="fa-solid fa-user"></i></span>
                    
                </a>
            </li>
            <div class="indicator"></div>
        </ul>
    </div>
    <script src="../static/js/nav.js"></script>
    <script src="https://kit.fontawesome.com/994fe1cfb9.js" crossorigin="anonymous"></script>
    `;
        this.style.color = "blue";
        this.style.fontFamily = "sans-serif";
    }
}

window.customElements.define("nav-footer", nav);