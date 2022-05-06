import { ContLogin, FormArea } from "./styled";

const Login =()=> {
    return(
        <ContLogin>
        <FormArea>
            
            <form>
                <div>
                    <label>Email</label>
                    <input className="logInput" type="email"/>
                </div>
                <div>
                    <label>Senha</label>
                    <input type="password"/>
                </div>
                <div>
                    <button type="submit">Entrar</button>
                </div>
            </form>
        </FormArea>
        </ContLogin>

    )
}
export default Login;