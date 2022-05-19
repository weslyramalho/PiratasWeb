import Chart from "react-google-charts";

export const data = [
    ["Finalizados", "Hours per day"],
    ["EM", 11],
    ["Eat", 2],
    ["Commute", 2],
    ["Watch tv", 2],
    ["Sleep", 7],
];
const Grafico = ()=>{
    return(
        <Chart
        chartType="PieChart"
        data={data}
        width={"100%"}
        height={"400px"}
        />
    )
}
export default Grafico;