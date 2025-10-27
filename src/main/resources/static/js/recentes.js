document.addEventListener("DOMContentLoaded", () => {
    const container = document.getElementById("recent-container");

    const cadastrosRecentes = [
        {
            data: "21/10/2025",
            nome: "Gabriel",
            descricao: "Descrição",
            foto: "https://i.pravatar.cc/150?img=1"
        },
        {
            data: "18/06/2025",
            nome: "Gustavo",
            descricao: "Descrição",
            foto: "https://i.pravatar.cc/150?img=2"
        },
        {
            data: "01/05/2025",
            nome: "Estalise",
            descricao: "Descrição",
            foto: "https://i.pravatar.cc/150?img=3"
        }
    ];

    cadastrosRecentes.forEach(user => {
        const card = document.createElement("div");
        card.classList.add("recent-card");

        card.innerHTML = `
            <div class="recent-date">Cadastrado ${user.data}</div>
            <div class="recent-user">
                <img src="${user.foto}" alt="${user.nome}">
                <div class="recent-user-info">
                    <h3>${user.nome}</h3>
                    <p>${user.descricao}</p>
                </div>
            </div>
        `;

        container.appendChild(card);
    });
});
