import { Area, FormArea } from "./styled";

const Funcionarios = () => {
    return(
        <Area>

        <div>
            <h1>Lista de Funcionarios ativos </h1>
            <h2>Front-End</h2>
            <div>
                <ol>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>

                </ol>
            </div>
            <h2>Back-End</h2>
            <div>
                <ol>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>

                </ol>
            </div>
            <h2>Designer</h2>
            <div>
                <ol>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>
                    <li>ALberto</li>

                </ol>
            </div>
        </div>
        <FormArea>
        <form method="post">
            <label>
                <div>nome</div>
                <div>
                    <input 
                    type="text"
                    value=""
                    required
                    >
                    </input>
                </div>
                <div>Email</div> 
                <div>
                    <input
                    type="email"
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>Telefone</div> 
                <div>
                    <input
                    type="number"
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>Cargo</div> 
                <div>
                    <input
                    type="text"
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>Foto</div> 
                <div>
                    <input
                    type=""
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>Salario</div> 
                <div>
                    <input
                    type="number"
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>Senha</div> 
                <div>
                    <input
                    type="password"
                    value=""
                    required
                    >    
                    </input>
                </div>
                <div>
                    <button>Cadastrar</button>
                </div>
            </label>
        </form>

        </FormArea>
        </Area>
            
    )
}
export default Funcionarios;