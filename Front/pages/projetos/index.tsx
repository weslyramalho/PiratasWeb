import Grafico from "../../src/components/Grafico";
import { Container, DvBox, HadControler } from "./styled";

const Projetos = () => {
    return(
        <Container>
            <HadControler>
                PROJETOS
            </HadControler>
            <DvBox >
               <div className="Divum"> 
               <h3>Projeto</h3>
               <h2>Projeto alfa</h2>
               </div> 
               <div className="Divdois">
                   <h3>Cliente</h3>
                   <h2>Artur</h2>
                </div>
               <div className="DivTres">
                 <h3>Data de Entrega</h3>
                   <h2>22/06/2022</h2>
                   
               </div>
               <div className="DivQuatro">
                    <h3>Quantidade Horas</h3>
                   <h2>150 horas</h2>
                   </div>
               <div className="DivOito">
                    <h3>Valor Por Hora</h3>
                   <h2>R$ 200,00</h2>
               </div>
               <div className="DivNove">
                    <h3>Valor do Projeto</h3>
                   <h2>R$ 7.500,00</h2>
               </div>
             
                   <div className="DivOnze">
                    <h3>Prioridade</h3>
                   <h2>Alta</h2>
                   </div>

                <div className="DivSete">
                    <h3>Descrição do Projeto</h3>
                    <p>Escreva um programa que receba quatro números inteiros, calcule e apresente a média aritmética entre eles. Observação: não esqueça de formatar o valor da média no 
momento de apresentá-lo, para que sejam impressas apenas duas casas decimais.</p>
                </div>


               <div className="DivCinco">
               <Grafico />
               </div>
               <div className="DivSeis">
                   <h3>Equipe Ativa</h3>
                   <ol>
                       <li>Lider: João Cardoso</li>
                       <li>Designer: Maria Alonso</li>
                       <li>Front-End: Ana Paula</li>
                       <li>Backend: Roberto</li>
                       <li>Backend: Paulão</li>

                   </ol>
                   </div>               
            </DvBox>
        </Container>
    )
}
export default Projetos;