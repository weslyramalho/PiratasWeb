import { FormArea } from "./styled";

const Login =()=> {
    return(
        <FormArea>
            <form>
                <div>
                    <label>Email</label>
                    <input type="email"/>
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

    )
}
export default Login;