import React from 'react';
import FormComponent from '../components/FormComponent';
import axios from 'axios';

class FormContainer extends React.Component{

    constructor(props){

        super(props);
        this.state = {

            pavadinimas : "",
            aprasymas: "",
            sventesTipas: "",
            paveiksliukas: "",
            veliava: ""
        }
    }

    handleChangePavadinimas = (e) => {

        e.preventDefault();

        this.setState({vardas: e.target.pavadinimas})
    }

    handleChangeAprasymas = (e) => {

        e.preventDefault();

        this.setState({aprasymas: e.target.aprasymas})
    }


    handleChangeSventesTipas = (e) => {

        e.preventDefault();

        this.setState({sventesTipas: e.target.value})
    }

    handleChangePaveiksliukas = (e) => {

        e.preventDefault();

        this.setState({paveiksliukas: e.target.value})
    }

    handleChangeVeliava = (e) => {

        e.preventDefault();

        this.setState({veliava: e.target.veliava})
    }

    

    handleSubmit = (e) => {

        e.preventDefault();
        let sventeCard = {

            pavadinimas : this.state.pavadinimas,
            aprasymas: this.state.aprasymas,
            sventesTipas: this.state.sventesTipas,
            paveiksliukas: this.state.paveiksliukas,
            veliava: this.state.veliava
        };

        axios.post("http://localhost:8080/add", sventeCard);

        this.setState({pavadinimas: ""})
        this.setState({aparasymas: ""})
        this.setState({sventesTipas: ""})
        this.setState({paveiksliukas: ""})
        this.setState({veliava: ""})
    }



    render(){

        return(

            <div className="row">
            
            <FormComponent

            pavadinimas={this.state.pavadinimas}
            aparasymas={this.state.aprasymas}
            sventesTipas ={this.state.sventesTipas}
            paveiksliukas={this.state.paveiksliukas}
            veliava={this.state.veliava}
            onSubmit={this.handleSubmit}
            onPavadinimasChange={this.handleChangePavadinimas}
            onAprasymasChange={this.handleChangeAprasymas}
            onSventesTipasChange={this.handleChangeSventesTipas}
            onPaveiksliukasChange={this.handleChangePaveiksliukas}
            onVeliavaChange={this.handleChangeVeliava}           
            />

            </div>

            

            
        )



    }
}

export default FormContainer;