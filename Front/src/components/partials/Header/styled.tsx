<style>
@import url('https://fonts.googleapis.com/css2?family=Nunito:wght@700&display=swap');
</style>
import React from "react";
import styled from "styled-components";

export const HeaderArea = styled.div`
height: 60px;
background-color: #2A0042;

.container {
    max-width: 1000px;
    margin: auto;
    display: flex;
}
a {
    text-decoration: none;
}
nav {
    padding-left: 100px;
    padding-top:10px;
    padding-bottom:10px;
    ul, li {
        margin:0;
        padding:0;
        list-style:none;
    }
    ul {
        display:flex;
        align-items:center;
        height:40px;
    }
    button {
        width: 130px;
        height : 45px;
        background: #8D01DD;
        border-radius: 11px;
        font-family: 'Nunito', sans-serif;
        font-style: normal;
        font-weight: 700;
        font-size: 22px;
        line-height: 40px;
        color: #FFFFFF;
    }
    li {
        font-style: normal;
        font-weight: 700;
        font-size: 20px;
        line-height: 40px;
        font-family: 'Nunito', sans-serif;
        color: #FFFFFF;
        margin-left:20px;
        margin-right:20px
        }
        .a, .button {
            border:0;
            background: none;
            color:#FFFFFF;
            font-size:14px;
            text-decoration:none;
            cursor:pointer;
            outline:0;
            &:hover {
                color:#999;
            }
            &.button {
                background-color:#38732F;
                border-radius:4px;
                color:#FFF;
                padding:5px 10px;
            }
            &.button:hover {
                background-color:#E57706;
            }
        
    }
}

//responsividade
@media (max-width: 864px){
    & {
        height: auto;
    }
    .container{
        flex-direction:column;
    }
    .logo {
        justify-content:center;
        margin:20px 0;
    }
    nav {
        padding-left: 0px;

    }
    nav ul {
         flex-direction:column;
         height: auto;
    }
    nav li {
        margin:10px 20px;
    }
}
`

