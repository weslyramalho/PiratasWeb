import styled from "styled-components"
export const HadControler = styled.div`
background-color: #3E6FCB;
height: 80px;
border-radius: 15px;
align-items: center;

justify-content: center;
display: flex;
`

export const Container = styled.div`
background-color: ; 
height: 900px;

`
export const DvBox = styled.div`
display: grid;
grid-template-columns: repeat(4, 1fr);
gap: 10px;
grid-auto-rows: minmax(100px, auto);
.Divum {
    grid-column: 1;
    grid-row: 1;
    background-color: red;
    border-radius: 10px;
}
.Divdois {
    grid-column: 2;
    grid-row: 1;
    background-color: #f8f2f2;
    border-radius: 10px;


}
.DivTres {
    grid-column: 3;
    grid-row: 1;
    background-color: #00ff00;
    border-radius: 10px;

}
.DivQuatro {
    grid-column: 4;
    grid-row: 1;
    background-color: #0a0707;
    border-radius: 10px;

}
.DivCinco {
    grid-column: 1;
    grid-row: 2/6;
    background-color: #ff00b3;

}
.DivSeis {
    grid-column: 2;
    grid-row: 2/4;
    background-color: #0099ff;

}

`