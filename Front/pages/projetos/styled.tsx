import styled from "styled-components"
export const HadControler = styled.div`
background-color: #83AEFE;
height: 80px;
border-radius: 15px;
align-items: center;

justify-content: center;
display: flex;
`

export const Container = styled.div`
background-color: #3E6FCB; 
height: 900px;

`
export const DvBox = styled.div`
display: grid;
grid-template-columns: repeat(3, 1fr);
gap: 10px;
grid-auto-rows: minmax(100px, auto);
.Divum {
    grid-column: 1 / 2;
    grid-row: 1;
    background-color: red;
}
.Divdois {
    grid-column: 2 / 4;
    grid-row: 1 / 3;
    background-color: #f8f2f2;

}
.DivTres {
    grid-column: 1;
    grid-row: 2 / 5;
    background-color: #00ff00;

}
.DivQuatro {
    grid-column: 3;
    grid-row: 3;
    background-color: #0a0707;

}
.DivCinco {
    grid-column: 2;
    grid-row: 3;
    background-color: #ff00b3;

}
.DivSeis {
    grid-column: 3;
    grid-row: 4;
    background-color: #0099ff;

}

`