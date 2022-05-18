import { Container, DvBox, HadControler } from "./styled";

const Projetos = () => {
    return(
        <Container>
            <HadControler>
                PROJETOS
            </HadControler>
            <DvBox >
               <div className="Divum"> um</div> 
               <div className="Divdois"> dois </div>
               <div className="DivTres">tres</div>
               <div className="DivQuatro">quatro</div>
               <div className="DivCinco">cinco</div>
               <div className="DivSeis">seis</div>               
            </DvBox>
        </Container>
    )
}
export default Projetos;