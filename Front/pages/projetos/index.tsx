import Grafico from "../../src/components/Grafico";
import { Container, DvBox, HadControler } from "./styled";

const Projetos = () => {
    return(
        <Container>
            <HadControler>
                PROJETOS
            </HadControler>
            <DvBox >
               <div className="Divum"> Em Andamento</div> 
               <div className="Divdois"> Concluido </div>
               <div className="DivTres">Atrasado</div>
               <div className="DivQuatro">Dentro do prazo</div>
               <div className="DivCinco">cinco
               <Grafico />
               </div>
               <div className="DivSeis">seis</div>               
            </DvBox>
        </Container>
    )
}
export default Projetos;