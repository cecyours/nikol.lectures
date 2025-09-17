import React, { Component } from "react";

class ClassComp extends Component {
    constructor(props) {
        super(props);
        this.state = {
            message : "Welcome to React Class Component"
        }
    }
    render() {
        return (
            <div>
                <h1>{this.props.name}</h1>
                <h1>{this.state.message}</h1>
                <h2>This is created using Class Component</h2>
            </div>
        );
    }
}

export default ClassComp;