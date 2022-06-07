class head extends HTMLElement{
    constructor(){
        super();
    }

    connectedCallback(){
        
        this.innerHTML = `<meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Catalog</title>`;
        this.style.color = "blue";
        this.style.fontFamily = "sans-serif";
    }
}

window.customElements.define("head-html", head);

