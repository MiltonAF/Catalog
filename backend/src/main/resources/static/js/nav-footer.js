class nav extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
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
    `;
   
  }
}

window.customElements.define("nav-footer", nav);
