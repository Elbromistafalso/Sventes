import React from 'react';
import SventeListComponent from '../components/SventeListComponent';
import AlertComponent from '../components/AlertComponent';
import axios from 'axios';


class SventeListContainer extends React.Component{

    constructor(props){

        super(props);
        this.state= {sventes: []};
        this.isRequestToDelete = false;
        this.deleteSveikinimas = "";
        
    }

    componentDidMount(){

        axios.get("http://localhost:8080/Elbromistafalso-spring")
        .then((response) => {

            this.setState({sventes :response.data})

        })
        .catch((error) => {

            console.log(error);
        })

    

    }

    handleDeleteConfirmationSubmit = (e) => {

        e.preventDefault();
        this.setState({isRequestToDelete: true})
        
    }

   

    render(){

        if(this.state.sveikinimai.length < 1){

            return(<AlertComponent/>)
        }

        return(<SventeListComponent sventes={this.state.sventes} isRequestToDelete={this.state.isRequestToDelete}/>)
    }
}

export default SventeListContainer