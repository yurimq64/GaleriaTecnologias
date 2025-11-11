import './App.css';

import { useState, useEffect } from 'react';

function App() {

    const [tecnologias, setTecnologias] = useState([]);
    const [termoBusca, setTermoBusca] = useState('');

    const tecnologiasFiltradas = tecnologias.filter(tec =>
        tec.nome.toLowerCase().includes(termoBusca.toLowerCase())
    );

    useEffect(() => {
        fetch('http://localhost:8080/api/tecnologias')
            .then(response => response.json())
            .then(dados => setTecnologias(dados))
            .catch(error => console.log('Erro ao buscar dados: ', error));
    }, []);

    return (
        <>
            <header>
                <h1>Galeria de Tecnologias</h1>
                <input
                    type="text"
                    id="campo-busca"
                    placeholder="Filtrar por nome..."
                    value={termoBusca}
                    onChange={evento => setTermoBusca(evento.target.value)}
                />
            </header>

            <main>
                <div id="galeria-cards" className="galeria-container">
                    {tecnologiasFiltradas.map(tec => (
                        <div key={tec.id} className="card">
                            <h2 className="card-nome">{tec.nome}</h2>
                        </div>
                    ))}
                </div>
            </main>
        </>
    );
}

export default App;