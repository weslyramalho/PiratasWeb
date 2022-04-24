import React from "react";
import { HeaderArea } from "./styled";
const Header = () => {
    return (
        <HeaderArea>
            <div className="container">
                <div className="logo">
                    <img src="/imagen/logo.svg" />
                </div>
                <nav>
                    <ul>
                        <li>
                            Projetos
                        </li>
                        <li>
                            Funcionarios
                        </li>
                        <li>
                            Clientes
                        </li>
                        <li>
                            <button >Sair</button>
                        </li>
                    </ul>

                </nav>

            </div>
        </HeaderArea>
    )
}
export default Header;