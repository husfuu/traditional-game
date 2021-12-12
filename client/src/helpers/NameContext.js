import { useState, createContext } from "react";

const NameContext = createContext({
    empty: true
});

const NameProvider = (props) => {
    const [name, setName] = useState("husniiiii");
    // the state that we'll be storing the username into

    return (
        <NameContext.Provider value={{ name, setName }}>
            {props.children}
        </NameContext.Provider>
    );
};

export {NameContext, NameProvider};