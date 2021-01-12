import React from 'react';
import Proptypes from 'prop-types';

let FormComponent = (props) => {

    return(

        <div>
            <form className="form" enctype="multipart/form-data" method = "post">
                <div className="form-group">
                    <label>Vardas: </label>
                    <input className="form-control" value={props.pavadinimas} onChange={props.onPavadinimasChange}></input>
                </div>
                <div className="form-group">
                    <label>Aprasymas: </label>
                    <input className="form-control" value={props.aprasymas} onChange={props.onAprasymasChange}></input>
                </div>
                <div className="form-group">
                    <label>Sventes tipas: </label>
                    <select className="form-control" value={props.sventesTipas} onChange={props.onSventesTipasChange}>
                         <option value="valstybine">Valstybine</option>
                         <option value="tautine_religine">Tautine-religine</option>
                         <option value="atmintina">Atmintina</option>
                         <option value="netradicine">Netradicine</option>
                    </select>
                </div>
                <div className="form-group">
                    <label>Iskeliama veliava?: </label>
                    <select className="form-control" value={props.veliava} onChange={props.onVeliavaChange}>
                         <option value="true">Taip</option>
                         <option value="false">Ne</option>
                    </select>
                </div>
                <div className="form-group">
                    <label>Paveiksliukas
                    <input className="form-control" type="file" value={props.paveiksliukas} onChange={props.onPaveiksliukasChange}></input>
                    </label>
                </div>
            <button className="btn" onClick={props.onSubmit}>Save</button>
            </form>
        </div>
    )
}

FormComponent.propTypes = {

    pavadinimas: Proptypes.string.isRequired,
    aprasymas: Proptypes.string.isRequired,
    sventesTipas: Proptypes.string.isRequired,
    paveiksliukas: Proptypes.string.isRequired,
    vekuava: Proptypes.string.isRequired,

    onSubmit: Proptypes.func.isRequired,
    onPavadinimasChange: Proptypes.func.isRequired,
    onAprasymasChange: Proptypes.func.isRequired,
    onSventesTipasChange: Proptypes.func.isRequired,
    onPaveiksliukasChange: Proptypes.func.isRequired,
    onVeliavaChange: Proptypes.func.isRequired

}

export default FormComponent