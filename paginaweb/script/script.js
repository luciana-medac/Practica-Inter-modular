function cambiarTema() {
    var cuerpo = document.body;
    var boton = document.querySelector("button");

    if (cuerpo.className === "tema-claro") {
        cuerpo.className = ""; // Quita el tema claro (regresa a oscuro)
        boton.innerHTML = "Cambiar a Tema Claro";
    } else {
        cuerpo.className = "tema-claro"; // Aplica tema claro
        boton.innerHTML = "Cambiar a Tema Oscuro";
    }
}
