import React from "react";
import { HeaderArea } from "./styled";
const Header = () => {
    return (
        <HeaderArea>
            <div className="container">
                <div className="logo">
                    <img src="/logo.svg" />
                </div>

            </div>
        </HeaderArea>
    )
}
export default Header;