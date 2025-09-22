import React, { PureComponent } from "react";

class PureComp extends PureComponent {
    constructor(props) {
        super(props);
        this.state = {
           count : 0
        };
    }
  render() {
    return (
      <div>
        <h1>This is created using Pure Component</h1>
        <h2>Count : {this.state.count}</h2>
        <button onClick={() => this.setState({count: this.state.count})}>Same Value</button>
        <button onClick={() => this.setState({count: this.state.count + 1})}>Increment</button>

      </div>
    );
  }
}

export default PureComp;